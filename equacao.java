package equacao2grau;

public class equacao {
    double a,b,c,x1,x2;
    
    public equacao(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double delta(){
        return (b*b - 4*a*c);
    }
    
    void resolver(double a,double b,double c){
        double d = b*b - 4*a*c;
        
        if(d<0){
            throw new RuntimeException("A equação não admite uma solução real!");
        }else{
            this.x1 = (-b + Math.sqrt(d))/2*a;
            this.x2 = (-b - Math.sqrt(d))/2*a;
        }
        
        if(this.x1>this.x2){
            double temp = this.x1;
            this.x1 = this.x2;
            this.x2 = temp;
        }
    }
}
