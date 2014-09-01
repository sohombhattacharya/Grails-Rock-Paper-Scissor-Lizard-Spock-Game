<html>
	<head>
	</head>
	<body>
	<h1>Rock, Paper, Scissor, Lizard, Spock!</h1>
	<hr></hr>
	<h2>Welcome Player 2!</h2>
	<g:form controller="Game" action="player2" params="[choice:'Rock']">
		<g:submitButton id="btn" name="loginButton" value="Rock"/>
	</g:form>
	<g:form controller="Game" action="player2" params="[choice:'Paper']">
		<g:submitButton id="btn" name="loginButton" value="Paper"/>
	</g:form>
	<g:form controller="Game" action="player2" params="[choice:'Scissor']">
		<g:submitButton id="btn" name="loginButton" value="Scissor"/>
	</g:form>
	<g:form controller="Game" action="player2" params="[choice:'Lizard']">
		<g:submitButton id="btn" name="loginButton" value="Lizard"/>
	</g:form>
	<g:form controller="Game" action="player2" params="[choice:'Spock']">
		<g:submitButton id="btn" name="loginButton" value="Spock"/>
	</g:form>
	<p>Selected: ${p2Choice}</p>
	<hr></hr>
	<g:form controller="Game" action="results" params="[player: 'player2']">
		<g:submitButton id="btn" name="loginButton" value="See who won!"/>
	</g:form>
	
	
	
	
	</body>
</html>