
package arraysdemo;

public class Student {
    
    //comment added at 1:21 PM
    //adding new comment at 1:29PM
  //adding comment for fetch and merge
    //2nd comment for fetch and merge
    
    private String sID;
    private String sName;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }
    

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
   }
