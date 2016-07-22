/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal;

/**
 *
 * @author thilinad
 */
public class StudentTerminal {
    private String name;
    private String address;
    private String parentName;
    private String tp;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
