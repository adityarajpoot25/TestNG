package test;

public class Series {
	
//	Series :1,1,2,3,5,8
//	01
//	12
//	23
//	34
//	45
//	56

	public static void main(String[] args) {
//		String s="adi";
	int n1=1,n2=1,n3=0;
	System.out.println(n1+" "+ n2);
	for(int i=1;i<10;i++) {
		
		n3=n1+n2;
		System.out.println(n3);
		n2=n1;
		n1=n3;
		
	}
//	System.out.println(n3);
	

	}

//	4 years,(URI:endpoint/resoucres/?q=serch)
//	Rest Assured: 200, 201, 404,400, 408,401,403,, 500,50...3xx, Put and post: create new
//	Scenario: new data-post, student id-p
//	
//	given(Header/Paramtesr) when(resources/Method)  and then(logall)
//	
//	
//	list of element <findElements().siz
//	
//	list<Weblement> l= driver.findELemnts(//xpath);
//			list.size();
//			
//			Actions
//			
//		,,,resolution of page
		
		
		
		
}
