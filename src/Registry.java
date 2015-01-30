import java.util.*;

public class Registry extends Observable {

	private List<BusTravelLog> busTravelLogs=new ArrayList<>();
	private List<DutyLog> dutyLogs=new ArrayList<>();
	private List<RepairLog> repairLogs=new ArrayList<>();
	private List<SalesLog> salesLogs=new ArrayList<>();

    public List<BusTravelLog> getBusTravelLogs() {
        return busTravelLogs;
    }

    public void addBusTravelLog(BusTravelLog busTravelLog) {
        this.busTravelLogs.add(busTravelLog);
    }

    public List<DutyLog> getDutyLogs() {
        return dutyLogs;
    }

    public void addDutyLog(DutyLog dutyLogs) {
        this.dutyLogs.add(dutyLogs);
    }

    public List<RepairLog> getRepairLogs() {
        return repairLogs;
    }

    public void addRepairLog(RepairLog repairLog) {
        this.repairLogs.add(repairLog);
    }

    public List<SalesLog> getSalesLogs() {
        return salesLogs;
    }

    public void addSalesLog(SalesLog salesLog) {
        this.salesLogs.add(salesLog);
    }
        
        

}