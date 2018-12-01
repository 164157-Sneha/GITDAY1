package Sneha.java;
import java.util.ArrayList;
import java.util.List;

public class Departments {

	public static void main(String[] args) {
		 
		List<Emplo> emp = new ArrayList<Emplo>();
		
        emp.add(new Emplo(121,"Sneha",10,"Cloud",2500,"Developer"));
        emp.add(new Emplo(141,"Sai",20,"BIU",2200,"Techie"));
        emp.add(new Emplo(112,"Yashu",10,"Cloud",2300,"Analyst"));
        emp.add(new Emplo(132,"Swathi",30,"IMS",2500,"Analyst"));
        emp.add(new Emplo(113,"Sahana",10,"Cloud",2000,"Clerk"));
        emp.add(new Emplo(124,"Zehara",30,"IMS",3000,"President"));
        emp.add(new Emplo(176,"Shruthi",20,"BIU",3000,"Manager"));
        emp.add(new Emplo(144,"Siya",30,"IMS",1500,"Salesman"));
        emp.add(new Emplo(198,"Tanya",20,"BIU",1500,"Salesman"));
        emp.add(new Emplo(161,"Varshitha",20,"BIU",1200,"Clerk"));
        emp.add(new Emplo(182,"Vidya",30,"IMS",3500,"Manager"));
        
        System.out.println("1. Departments");
        emp.stream()
        .map(n->n.getDeptname())
        .distinct()
        .forEach(System.out::println);
        
        System.out.println("\n");
        
        System.out.println("2. Employees in the company");
        emp.stream()
        .map(x->x.getEmpname())
        .forEach(System.out::println);
        
        System.out.println("\n");
        
        System.out.println("3. Employees present in dept 30 are");
        emp.stream()
        .filter(l->l.getDeptno()==30)
        .map(y->y.getEmpname())
        .forEach(System.out::println);
        System.out.println("\n");
        
        System.out.println("4. Clerks present in different departments are");
        emp.stream()
        .filter(n->n.getPosition().equals("Clerk"))
        .map(x->x.getEmpname()+" " +x.getDeptno()+ " "+x.getDeptname())
        .forEach(System.out::println);
        
        System.out.println("\n");
        
        System.out.println("4. departments greater than or equal to 20");
        emp.stream()
        .filter(n->n.getDeptno()>=20)
        .map(x->x.getDeptno()+ " " + x.getEmpname())
        .forEach(System.out::println);
        System.out.println("\n");
        
        System.out.println("5. Department 20 and sal greayter then 2000");
        emp.stream()
        .filter(n->(n.getDeptno()==20 && n.getSalary()>2000))
        .map(x->x.getEmpname()+ " "+ x.getPosition()+ " " + x.getSalary())
        .forEach(System.out::println);
        System.out.println("\n");
	
	    System.out.println("6. Salesman in dept 30");
	    emp.stream()
	    .filter(n->(n.getDeptno()==30 && n.getPosition().equals("Salesman") && n.getSalary()>=1500))
	    .map(x->x.getEmpname())
	    .forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("7. President or manager");
	    emp.stream()
	    .filter(n->(n.getPosition().equals("President") || n.getPosition().equals("Manager")))
	    .map(l->l.getEmpname())
	    .forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("8. Managers in dept 30");
	    emp.stream()
	    .filter(n->(n.getDeptno()==30 && n.getPosition().equals("Manager")))
	    .map(a->a.getEmpname())
	    .forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("9. Employees earning greater then 2000");
	    emp.stream()
	    .filter(a->a.getSalary()>2000)
	    .map(n->n.getEmpname())
	    .sorted()
	    .forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("10. Managers and clerks in dept 10");
	    emp.stream()
	    .filter(m->((m.getPosition().equals("Manager") || m.getPosition().equals("Clerk")) && m.getDeptno()==10))
	    		.map(x->x.getEmpname())
	    		.forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("11.Employees sorted according to names");
	    emp.stream()
	    .map(n->n.getEmpname())
	    .sorted() 
	    .forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("12. Managers in dept 10 and clerks in dept 20");
	    emp.stream()
	       .filter(n->((n.getPosition().equals("Manager") && n.getDeptno()==10) || (n.getPosition().equals("Clerk") && n.getDeptno()==20)))
	       .map(z->z.getEmp_id() + " " + z.getEmpname())
	       .forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("13. Employees earning between 1200 and 1400 are:");
	    emp.stream()
	    .filter((a->a.getSalary()>=1200 && a.getSalary()<=1400 ))
	    .map(a->a.getEmp_id()+ " "+ a.getEmpname()+" "+a.getSalary())
	    .forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("14. Clerks,Salesman and Analyst");
	    emp.stream()
	    .filter(b->(b.getPosition().equals("Clerk") || b.getPosition().equals("Salesman") || b.getPosition().equals("Analyst")))
	    .map(s->s.getEmpname())
	    .forEach(System.out::println);
	    System.out.println("\n");
	    
	    System.out.println("15. Replace character");
	    emp.stream()
	    .map(n->n.getEmpname().replace('a', 'e'))
	    .forEach(System.out::println);
	}

}
