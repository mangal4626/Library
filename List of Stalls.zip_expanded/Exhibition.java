import java.util.*;
public class Exhibition {
    private Long id;
    private String name;
    private List<Stall> stallList;
    public Exhibition(){}
    public Exhibition(Long id,String name){
        this.id=id;
        this.name=name;
    }
    public Exhibition(Long id,String name,List<Stall> stallList){
        this.id=id;
        this.name=name;
        this.stallList=stallList;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public List<Stall> getStallList(){
        return this.stallList;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setStallList(List<Stall> stallList){
        this.stallList=stallList;
    }
}