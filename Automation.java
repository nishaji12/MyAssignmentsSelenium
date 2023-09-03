package Assignment3;

public class Automation extends MultipleLanguage implements Language,TestTool {

	@Override
	public void Selenium() {
		System.out.println("hi i am selenium");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Java() {
		System.out.println("hi i am Java");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ruby() {
		System.out.println("hi i am ruby");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Automation auto =new Automation();
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.python();
	}
	

}
