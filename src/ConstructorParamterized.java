import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ConstructorParamterized {
    int empId;
    String empName;

    ConstructorParamterized(int id, String name) {
        this.empId = id;
        this.empName = name;
    }
 /*   void info() {
        System.out.println("id: "+empId+" Name: "+empName);
    } */

    public static void main(String[] args) {
        ConstructorParamterized obj1 = new ConstructorParamterized (1000, "Hitesh");
        System.out.println("ID: "+obj1.empId+" Name: "+obj1.empName);
       // obj1.info();
    }

}
