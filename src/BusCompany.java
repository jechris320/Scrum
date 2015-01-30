import java.util.*;

public class BusCompany {

	private List<Bus> busses=new ArrayList<>();
	private List<Employee> employees=new ArrayList<>();
	private String name;
	private Date dateEstablished;

    public List<Bus> getBusses() {
        return busses;
    }

    public void addBus(Bus bus) {
        this.busses.add(bus);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Date getDateEstablished() {
		return this.dateEstablished;
	}

	/**
	 * 
	 * @param dateEstablished
	 */
	public void setDateEstablished(Date dateEstablished) {
		this.dateEstablished = dateEstablished;
	}

}