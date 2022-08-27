import java.util.ArrayList;
import java.util.List;

/*
 DB로부터 데이터를 가져오는 객체가 존재한다고 가정
 여기서 DB에서 가져온 데이터를 매번 new로 객체 생성하는 것은
 비용이 크기 때문에 한 번 DB에 접근하여 데이터를 가져온 객체를 필요에
 따라 새로운 객체에 복사하여 데이터 수정 작업을 하는 것이 더 좋은 방법임
 */

public class Employees implements Cloneable{
    // Cloneable 인터페이스를 구현

    private List<String> empList;

    public Employees(){
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list){
        this.empList=list;
    }

    public void loadData(){
        // 데이터 복사
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        // 데이터 복사본 가져오기
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        //
        for(String s : this.empList){
            temp.add(s);
        }
        return new Employees(temp);
    }

}