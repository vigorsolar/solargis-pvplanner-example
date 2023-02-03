package cl.vigorsolar.solargis.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ws.client.core.WebServiceTemplate;

public class PvPlannerWsClient {
	
	/*
	@Autowired
	@Qualifier("pvPlannerTemplate")
	WebServiceTemplate template;

	public CalculateResponse callPvPlanner() {
		return (CalculateResponse) template.marshalSendAndReceive(prepareRequest());
	}

	private CalculateRequest prepareRequest() {
		// just sample request
		CalculateRequest request = new CalculateRequest();
		Location location = new Location();
		location.setLat(48.612590); // location of demo site
		location.setLng(20.827079);
		request.setLocation(location);
		PvSystem system = new PvSystem();
		system.setInstalledPower(1);
		system.setModuleType(ModuleTypeEnum.C_SI);
		Settings settings = new Settings();
		settings.setInverterEfficiency(97.5);
		settings.setDcLosses(5.5);
		settings.setAcLosses(1.5);
		settings.setAvailability(99);
		system.setSettings(settings);
		MountingFixedRoofMounted mounting = new MountingFixedRoofMounted();
		mounting.setAzimuth(175);
		mounting.setInclination(45D);
		system.setMounting(mounting);
		request.setSystem(system);
		return request;
	}
	*/

}