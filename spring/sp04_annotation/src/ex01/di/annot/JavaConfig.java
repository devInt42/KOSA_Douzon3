package ex01.di.annot;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("?չߵ???");
		hobbys.add("?߱???");
		
		MyCats myCats = new MyCats("????", 12, hobbys);
		
		myCats.setHobbys(hobbys);
		myCats.setWeight(3.0);
		myCats.setColor("black");
		
		return myCats;
	}
	
	@Bean
	public MyCats cat2() {  //<bean id="info" class="quiz.person.MyInfomation"  />
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("??ũ?ϱ?");
		hobbys.add("?ȱ???");
		
		MyCats myCats = new MyCats("??????", 3, hobbys);
		myCats.setWeight(2.3);
		myCats.setColor("white");
		
		return myCats;
	}


	
	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1());   //  ref="employee" 
		return cats;
	}
	
//<bean id="info2" class="quiz.person.MyInfomation">
//	<property name="person"  ref="employee" />
//</bean>

}
