package rpsls

class GameController {
	
	class Player{
	
		String name; 
		String choice;
		
		Player(){}
	}
	
	Player[] players = new Player[2];
	
	int counter = 0;
    
	def index() { 
		players[0] = new Player();
		players[1] = new Player();
		
		
	}
	
	def player1(){
		players[0] = new Player();
		players[0].name = "player1";
		players[0].choice = params.choice;
		
		return [p1Choice: params.choice]
	}
	
	def player2(){
		players[1] = new Player();
		players[1].name = "player2";
		players[1].choice = params.choice;
		
		return [p2Choice: params.choice]
		
	}
	
	def results(){
		
		if (players[0].choice != null && players[1].choice != null){
			String p1Choice = players[0].choice;
			String p2Choice = players[1].choice;
			String result = "";
			//remember to make a case in each set where both players put the same hand down
			
			if (p1Choice == "Rock" && p2Choice == "Paper")
				result = "Player 2's Paper defeated Player 1's Rock!";
			if (p1Choice == "Rock" && p2Choice == "Scissor")
				result = "Player 1's Rock defeated your Player 2's Scissor";
			if (p1Choice == "Rock" && p2Choice == "Lizard")
				result = "Player 1's Rock defeated your Player 2's Lizard";
			if (p1Choice == "Rock" && p2Choice == "Spock")
				result = "Player 2's Spock defeated Player 1's Rock";
			if (p1Choice == "Rock" && p2Choice == "Rock")
				result = "Both Players played Rock!";
				
			if (p1Choice == "Paper" && p2Choice == "Rock")
				result = "Player 2's Rock defeated Player 1's Paper";
			if (p1Choice == "Paper" && p2Choice == "Scissor")
				result = "Player 2's Scissor defeated Player 1's Paper";
			if (p1Choice == "Paper" && p2Choice == "Lizard")
				result = "Player 2's Lizard defeated Player 1's Paper";
			if (p1Choice == "Paper" && p2Choice == "Spock")
				result = "Player 1's Paper defeated Player 2's Spock";
			if (p1Choice == "Paper" && p2Choice == "Paper")
				result = "Both Players played Paper!";
				
			if (p1Choice == "Scissor" && p2Choice == "Paper")
				result = "Player 1's Scissor defeated Player 2's Paper";
			if (p1Choice == "Scissor" && p2Choice == "Rock")
				result = "Player 2's Rock defeated Player 1's Scissor";
			if (p1Choice == "Scissor" && p2Choice == "Lizard")
				result = "Player 1's Scissor defeated Player 2's Lizard";
			if (p1Choice == "Scissor" && p2Choice == "Spock")
				result = "Player 2's Spock defeated Player 1's Scissor";
			if (p1Choice == "Scissor" && p2Choice == "Scissor")
				result = "Both Players played Scissor!";
				
			if (p1Choice == "Lizard" && p2Choice == "Paper")
				result = "Player 1's Lizard defeated Player 2's Paper";
			if (p1Choice == "Lizard" && p2Choice == "Scissor")
				result = "Player 2's Scissor defeated Player 1's Lizard";
			if (p1Choice == "Lizard" && p2Choice == "Rock")
				result = "Player 2's Rock defeated Player 1's Lizard";
			if (p1Choice == "Lizard" && p2Choice == "Spock")
				result = "Player 1's Lizard defeated Player 2's Spock";
			if (p1Choice == "Lizard" && p2Choice == "Lizard")
				result = "Both Players played Lizard!";
			
			if (p1Choice == "Spock" && p2Choice == "Paper")
				result = "Player 2's Paper defeated Player 1's Spock";
			if (p1Choice == "Spock" && p2Choice == "Scissor")
				result = "Player 1's Spock defeated Player 2's Scissor";
			if (p1Choice == "Spock" && p2Choice == "Lizard")
				result = "Player 2's Lizard defeated Player 1's Spock";
			if (p1Choice == "Spock" && p2Choice == "Rock")
				result = "Player 1's Spock defeated Player 1's Rock";
			if (p1Choice == "Spock" && p2Choice == "Spock")
				result = "Both Players played Spock!";
			return [results: result, currPlayer: params.player, p1choice: p1Choice, p2choice: p2Choice]
			
		}
	
			if (players[1].choice == null){
			print "test"
			while (players[1].choice == null){
				print "test1"
				if (players[1].choice != null){
					
					String p1Choice = players[0].choice;
					String p2Choice = players[1].choice;
					String result = "";
					//remember to make a case in each set where both players put the same hand down
					
				if (p1Choice == "Rock" && p2Choice == "Paper")
					result = "Player 2's Paper defeated Player 1's Rock!";
				if (p1Choice == "Rock" && p2Choice == "Scissor")
					result = "Player 1's Rock defeated your Player 2's Scissor";
				if (p1Choice == "Rock" && p2Choice == "Lizard")
					result = "Player 1's Rock defeated your Player 2's Lizard";
				if (p1Choice == "Rock" && p2Choice == "Spock")
					result = "Player 2's Spock defeated Player 1's Rock";
				if (p1Choice == "Rock" && p2Choice == "Rock")
					result = "Both Players played Rock!";
					
				if (p1Choice == "Paper" && p2Choice == "Rock")
					result = "Player 2's Rock defeated Player 1's Paper";
				if (p1Choice == "Paper" && p2Choice == "Scissor")
					result = "Player 2's Scissor defeated Player 1's Paper";
				if (p1Choice == "Paper" && p2Choice == "Lizard")
					result = "Player 2's Lizard defeated Player 1's Paper";
				if (p1Choice == "Paper" && p2Choice == "Spock")
					result = "Player 1's Paper defeated Player 2's Spock";
				if (p1Choice == "Paper" && p2Choice == "Paper")
					result = "Both Players played Paper!";
					
				if (p1Choice == "Scissor" && p2Choice == "Paper")
					result = "Player 1's Scissor defeated Player 2's Paper";
				if (p1Choice == "Scissor" && p2Choice == "Rock")
					result = "Player 2's Rock defeated Player 1's Scissor";
				if (p1Choice == "Scissor" && p2Choice == "Lizard")
					result = "Player 1's Scissor defeated Player 2's Lizard";
				if (p1Choice == "Scissor" && p2Choice == "Spock")
					result = "Player 2's Spock defeated Player 1's Scissor";
				if (p1Choice == "Scissor" && p2Choice == "Scissor")
					result = "Both Players played Scissor!";
					
				if (p1Choice == "Lizard" && p2Choice == "Paper")
					result = "Player 1's Lizard defeated Player 2's Paper";
				if (p1Choice == "Lizard" && p2Choice == "Scissor")
					result = "Player 2's Scissor defeated Player 1's Lizard";
				if (p1Choice == "Lizard" && p2Choice == "Rock")
					result = "Player 2's Rock defeated Player 1's Lizard";
				if (p1Choice == "Lizard" && p2Choice == "Spock")
					result = "Player 1's Lizard defeated Player 2's Spock";
				if (p1Choice == "Lizard" && p2Choice == "Lizard")
					result = "Both Players played Lizard!";
				
				if (p1Choice == "Spock" && p2Choice == "Paper")
					result = "Player 2's Paper defeated Player 1's Spock";
				if (p1Choice == "Spock" && p2Choice == "Scissor")
					result = "Player 1's Spock defeated Player 2's Scissor";
				if (p1Choice == "Spock" && p2Choice == "Lizard")
					result = "Player 2's Lizard defeated Player 1's Spock";
				if (p1Choice == "Spock" && p2Choice == "Rock")
					result = "Player 1's Spock defeated Player 1's Rock";
				if (p1Choice == "Spock" && p2Choice == "Spock")
					result = "Both Players played Spock!";
					
					return [results: result, currPlayer: params.player, p1choice: p1Choice, p2choice: p2Choice]
					
				}
			}
		}
	
		if (players[0].choice == null){
			print "test2"
			while (players[0].choice == null){
				print "test3"
				if (players[0].choice != null){
					
					String p1Choice = players[0].choice;
					String p2Choice = players[1].choice;
					String result = "";
					//remember to make a case in each set where both players put the same hand down
					
				if (p1Choice == "Rock" && p2Choice == "Paper")
					result = "Player 2's Paper defeated Player 1's Rock!";
				if (p1Choice == "Rock" && p2Choice == "Scissor")
					result = "Player 1's Rock defeated your Player 2's Scissor";
				if (p1Choice == "Rock" && p2Choice == "Lizard")
					result = "Player 1's Rock defeated your Player 2's Lizard";
				if (p1Choice == "Rock" && p2Choice == "Spock")
					result = "Player 2's Spock defeated Player 1's Rock";
				if (p1Choice == "Rock" && p2Choice == "Rock")
					result = "Both Players played Rock!";
					
				if (p1Choice == "Paper" && p2Choice == "Rock")
					result = "Player 2's Rock defeated Player 1's Paper";
				if (p1Choice == "Paper" && p2Choice == "Scissor")
					result = "Player 2's Scissor defeated Player 1's Paper";
				if (p1Choice == "Paper" && p2Choice == "Lizard")
					result = "Player 2's Lizard defeated Player 1's Paper";
				if (p1Choice == "Paper" && p2Choice == "Spock")
					result = "Player 1's Paper defeated Player 2's Spock";
				if (p1Choice == "Paper" && p2Choice == "Paper")
					result = "Both Players played Paper!";
					
				if (p1Choice == "Scissor" && p2Choice == "Paper")
					result = "Player 1's Scissor defeated Player 2's Paper";
				if (p1Choice == "Scissor" && p2Choice == "Rock")
					result = "Player 2's Rock defeated Player 1's Scissor";
				if (p1Choice == "Scissor" && p2Choice == "Lizard")
					result = "Player 1's Scissor defeated Player 2's Lizard";
				if (p1Choice == "Scissor" && p2Choice == "Spock")
					result = "Player 2's Spock defeated Player 1's Scissor";
				if (p1Choice == "Scissor" && p2Choice == "Scissor")
					result = "Both Players played Scissor!";
					
				if (p1Choice == "Lizard" && p2Choice == "Paper")
					result = "Player 1's Lizard defeated Player 2's Paper";
				if (p1Choice == "Lizard" && p2Choice == "Scissor")
					result = "Player 2's Scissor defeated Player 1's Lizard";
				if (p1Choice == "Lizard" && p2Choice == "Rock")
					result = "Player 2's Rock defeated Player 1's Lizard";
				if (p1Choice == "Lizard" && p2Choice == "Spock")
					result = "Player 1's Lizard defeated Player 2's Spock";
				if (p1Choice == "Lizard" && p2Choice == "Lizard")
					result = "Both Players played Lizard!";
				
				if (p1Choice == "Spock" && p2Choice == "Paper")
					result = "Player 2's Paper defeated Player 1's Spock";
				if (p1Choice == "Spock" && p2Choice == "Scissor")
					result = "Player 1's Spock defeated Player 2's Scissor";
				if (p1Choice == "Spock" && p2Choice == "Lizard")
					result = "Player 2's Lizard defeated Player 1's Spock";
				if (p1Choice == "Spock" && p2Choice == "Rock")
					result = "Player 1's Spock defeated Player 1's Rock";
				if (p1Choice == "Spock" && p2Choice == "Spock")
					result = "Both Players played Spock!";
					
					return [results: result, currPlayer: params.player, p1choice: p1Choice, p2choice: p2Choice]
				}
			}
		}
		
		print "done"
	}
	
	
}
