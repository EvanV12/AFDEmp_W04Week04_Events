/**
 * 
 */
package p01ParparakisExtraLesson;

import java.util.ArrayList;

/**
 * @author Orville
 *
 */
public class TheEvents {

	/**
	 * 
	 */
	public TheEvents() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Events myEvents = new Events();
		myEvents.addElement(0, (Object)(new Childhood(2, "babybel")));
		System.out.println(myEvents.readElement(0, 0));
	//	myEvents.deleteElement(0, 0);

		Childhood cl = new Childhood(1, "kati");
		
		myEvents.updateElement(0, 0, (Object) cl);
		System.out.println(myEvents.readElement(0, 0));
		
		
		Childhood c = new Childhood();
		Teenager t = new Teenager();
		Adult a = new Adult();
		
		
		/*Childhood[] children = new Childhood[50];
		children[0].age = 11;
		children[0].description = "χιόνι";
		
		
		ArrayList<Childhood> cc = new ArrayList();		// αυτο ()   σημαινει καλω τον constructor
		
		
		
		// scenario 1
		c.age = 11;
		c.description = "χιόνι";
		cc.add(c);
		//cc.set(0, c);
		
		
		
		//scenario 2
		Childhood x =  new Childhood();
		x.age = 7;
		x.description = "gtbjlsn";
		cc.add(new Childhood());
		cc.set(cc.size() -1, x);
		
		
		x = new Childhood();
		x.age = 5;
		x.description = "AAAAAAAAAAAA";
		cc.add(new Childhood());
		cc.set(cc.size() -1, x);
		
		
		//scenario 3

		cc.add(new Childhood(11, "sfgkhgshvjsvhsjvh"));
		cc.add(new Childhood(2, "fynhsjvh"));
	//	System.out.println(cc.get(2).readElement(2));
				
		
		
		
		
		
		t.age = 17;
		t.description = "......";
		
		a.age = 222;
		a.description = "new marriage";
		
		System.out.println(cc.get(0));
		System.out.println();*/
		
		
	}

}
