package cl.vigorsolar.solargis.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;

import eu.geomodel.schema.ws.pvplanner.CalculateRequest;
import eu.geomodel.schema.ws.pvplanner.CalculateResponse;
import eu.geomodel.schema.ws.pvplanner.EfficiencyConstant;
import eu.geomodel.schema.ws.pvplanner.GeometryFixedOneAngle;
import eu.geomodel.schema.ws.pvplanner.InverterSettings;
import eu.geomodel.schema.ws.pvplanner.Losses;
import eu.geomodel.schema.ws.pvplanner.ModuleInstallationTypeEnum;
import eu.geomodel.schema.ws.pvplanner.ModuleSettings;
import eu.geomodel.schema.ws.pvplanner.ModuleTypeEnum;
import eu.geomodel.schema.ws.pvplanner.PvPlannerPort;
import eu.geomodel.schema.ws.pvplanner.PvPlannerPortService;
import eu.geomodel.schema.ws.pvplanner.PvSystem;
import eu.geomodel.schema.ws.pvplanner.Site;
import eu.geomodel.schema.ws.pvplanner.Terrain;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
		
		PvPlannerPortService service = new PvPlannerPortService();
		
		service.setHandlerResolver(portInfo -> {
			List<Handler> handlerList = new ArrayList<>();
			handlerList.add(new PvPlannerAuthenticationHandler());
			return handlerList;
		});
	
		PvPlannerPort port = service.getPort(PvPlannerPort.class);
		
		CalculateRequest request = new CalculateRequest();	    
	    Site site = new Site();
	    site.setLat(-33.3798249);
	    site.setLng(-71.0386902);
	    GeometryFixedOneAngle geometry = new GeometryFixedOneAngle();
	    geometry.setAzimuth(0);
	    geometry.setTilt(30);
	    site.setGeometry(geometry);
	    
	    
	    Terrain terrain = new Terrain();
	    terrain.setAzimuth(0);
	    terrain.setElevation(246);
	    terrain.setTilt(0.0);
	    site.setTerrain(terrain);
	    
	    
	    
	    PvSystem system = new PvSystem();
	    ModuleSettings moduleSettings = new ModuleSettings();
	    moduleSettings.setType(ModuleTypeEnum.CSI);
	    moduleSettings.setNominalPower(660);
	    moduleSettings.setOpenCircuitVoltageCoeff(-0.25);
	    moduleSettings.setShortCircuitCurrentCoeff(0.04);
	    moduleSettings.setPmaxCoeff(-0.34);
	    system.setModule(moduleSettings);
	    
	    InverterSettings inverterSettings = new InverterSettings();
	    EfficiencyConstant efficiencyConstant = new EfficiencyConstant();
	    efficiencyConstant.setPercent(98.65);
	    inverterSettings.setEfficiency(efficiencyConstant);
	    system.setInverter(inverterSettings);
	    
	    Losses losses = new Losses();
	    losses.setAc(1.5);
	    losses.setDc(12.5);
	    system.setLosses(losses);
	    
	    /*
	    TopologyRow topology = new TopologyRow();
	    topology.setType(TopologyTypeEnum.PROPORTIONAL);
	    topology.setRelativeSpacing(0.5);
	    system.setTopology(topology);
	    */
	    
	    
	    system.setAvailability(100.0);
	    system.setInstalledPower(0.660);
	    
	    system.setInstallationType(ModuleInstallationTypeEnum.ROOF_MOUNTED);
	    
	    site.setSystem(system);
	    request.setSite(site);
	
		CalculateResponse response = port.calculate(request);
	
		System.out.println("ETM (mes): "+ response.getCalculation().getOutput().getEtm().getMonthly());
		System.out.println("ETM (año): "+ response.getCalculation().getOutput().getEtm().getYearly());
		System.out.println("ESM (mes): "+ response.getCalculation().getOutput().getEsm().getMonthly());
		System.out.println("ESM (año): "+ response.getCalculation().getOutput().getEsm().getYearly());
		
		
		System.out.println(response.getSummary());
		
	}
}
