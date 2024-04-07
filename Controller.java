import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final FlowService flowService = new FlowService();

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList(){
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO(){
        return studentGroupService.getSortedStudentByFIO();
    }

    public List<Flow> sortrdFlows(List<Flow> flows) {
        return flowService.sortStreams(flows);
    }
}
