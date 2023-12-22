
public class simpleFactoryDesignPattern {
    
}
interface superHeroInterface{
    public String superPower();
}

class superHero implements superHeroInterface{
    String name=null;
    String superPower=null;
    public superHero(String name,String superPower){
        this.name=name;
        this.superPower=superPower;
    }
    public String superPower(){
return this.superPower;
    }
}
class makeSuperHeros{
    superHero newHero=null;
    public makeSuperHeros(String name,String superPower)
    {
newHero=new superHero(name,superPower);
    }
}