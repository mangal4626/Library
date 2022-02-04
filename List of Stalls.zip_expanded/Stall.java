public class Stall {
	private Long id;
    private String name;
    private String detail;
    private String owner;
    private Exhibition exhibition;
    public Stall(){}
    public Stall(Long id,String name,String detail,String owner,Exhibition exhibition){
        this.id=id;
        this.name=name;
        this.detail=detail;
        this.owner=owner;
        this.exhibition=exhibition;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDetail(){
        return this.detail;
    }
    public String getOwner(){
        return this.owner;
    }
    public Exhibition getExhibition(){
        return this.exhibition;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDetail(String detail){
        this.detail=detail;
    }
    public void setOwner(String owner){
        this.owner=owner;
    }
    public void setExhibition(Exhibition exhibition){
        this.exhibition=exhibition;
    }
}