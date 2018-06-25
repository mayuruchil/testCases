package webapp.junit;

public class ControllerAction {
	Service service;
	
	public String getDetails(int id){
		String userName = service.getName(id);
		return userName;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}
