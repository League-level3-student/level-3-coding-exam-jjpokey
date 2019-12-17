import java.util.ArrayList;

public class VoteProcessor {
int pf = 0;
int es = 0;
String vote = "";
char c;
	public String calculateElectionWinner(ArrayList<String> votes) {
		for(int i = 0; i < votes.size(); i++) {
			if(votes.get(i).charAt(0) == 'e' || votes.get(i).charAt(0) == 'E') {
				System.out.println("Edward snowden");
				es++;
			}
			if(votes.get(i).charAt(0) == 'p' || votes.get(i).charAt(0) == 'P') {
				System.out.println("Pope Francis");
				pf++;
			}
		}
		if(pf == es) {
			return "TIE";
		}
		if(pf > es) {
		return "pope francis";
		}
		if(es > pf) {
			return "edward Snowden";
		}
		
		return "TIE";
	}

}
