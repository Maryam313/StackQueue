import java.util.HashSet;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class Hashset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet<String> uniqueNameSet=new HashSet <>();
		//uniqueNameSet.add("Maryam");
		//uniqueNameSet.add("Alia");
		HashSet<String> CsDep=new HashSet <>();
		HashSet<String> eeDep=new HashSet <>();
		HashSet<String> resultSet=new HashSet <>();

		CsDep.add("Cs-Ds-L1");
		CsDep.add("Cs-Al-L2");
		CsDep.add("Cs-PH-L3");
		CsDep.add("Cs-Bp-L1");
		CsDep.add("Cs-MM-L1");


		eeDep.add("EE-BE-L1");
		CsDep.add("Cs-PH-L3");
		CsDep.add("Cs-MM-L1");
		eeDep.add("EE-BE-L2");

		
		resultSet.addAll(eeDep);
		resultSet.addAll(CsDep);
		
		
		//eeDep.addAll(CsDep);
		eeDep.retainAll(CsDep);
		


		for(String name:resultSet) {
			System.out.println(name);
		}
	}

}
