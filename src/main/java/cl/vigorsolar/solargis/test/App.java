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

/**
 * @author chelito
 *
 */
public class App {
	private static final String USERNAME = "demo";
	private static final String PASSWORD = "demo";
	
	public static void main(String[] args) {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
		
		PvPlannerPortService service = new PvPlannerPortService();
		
		service.setHandlerResolver(portInfo -> {
			List<Handler> handlerList = new ArrayList<>();
			handlerList.add(new PvPlannerAuthenticationHandler(USERNAME, PASSWORD));
			return handlerList;
		});
	
		PvPlannerPort port = service.getPort(PvPlannerPort.class);
		
		CalculateRequest request = new CalculateRequest();	    
	    Site site = new Site();
	    site.setLat(48.612590);
	    site.setLng(20.827079);
	    GeometryFixedOneAngle geometry = new GeometryFixedOneAngle();
	    geometry.setAzimuth(0);
	    geometry.setTilt(30);
	    site.setGeometry(geometry);
	    
	    /*
	    Terrain terrain = new Terrain();
	    terrain.setAzimuth(176);
	    terrain.setElevation(246);
	    terrain.setTilt(3.1);
	    site.setTerrain(terrain);
	    */
	    
	    
	    PvSystem system = new PvSystem();
	    ModuleSettings moduleSettings = new ModuleSettings();
	    moduleSettings.setType(ModuleTypeEnum.CSI);
	    system.setModule(moduleSettings);
	    
	    InverterSettings inverterSettings = new InverterSettings();
	    EfficiencyConstant efficiencyConstant = new EfficiencyConstant();
	    efficiencyConstant.setPercent(97.5);
	    inverterSettings.setEfficiency(efficiencyConstant);
	    inverterSettings.setInterconnection(null);
	    system.setInverter(inverterSettings);
	    
	    Losses losses = new Losses();
	    losses.setAc(1.5);
	    losses.setDc(5.5);
	    system.setLosses(losses);
	    
	    /*
	    TopologyRow topology = new TopologyRow();
	    topology.setType(TopologyTypeEnum.PROPORTIONAL);
	    topology.setRelativeSpacing(0.5);
	    system.setTopology(topology);
	    */
	    
	    
	    system.setAvailability(100.0);
	    system.setInstalledPower(1.5);
	    
	    system.setInstallationType(ModuleInstallationTypeEnum.ROOF_MOUNTED);
	    
	    site.setSystem(system);
	    request.setSite(site);
	
		CalculateResponse response = port.calculate(request);
		System.out.println(response.getCalculation().getOutput().getEsm().getMonthly());
		System.out.println(response.getSummary());
		
	}
}
