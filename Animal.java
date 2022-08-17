package projjavaPOO;

public class Animal {
    ISomAnimal Som;
public Animal(ISomAnimal s){
	this.Som = s;

	
}
public String Grito(int intensidade) {
   return this.Som.Grito(intensidade);
}
}


