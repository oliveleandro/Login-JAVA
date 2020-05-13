<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript">
  function limpaAvisos()
  {
    document.getElementById('aviso').innerHTML = '';
  } 
  //Executar a função limpaAvisos após 3 segundos.
  setTimeout('limpaAvisos()', 3000);
</script>
</head>
<body>
	<div id="aviso">
        <h3>${erro}</h3>
    </div>    
    <form action="AutenticacaoLogin" method="post">    
    <fieldset>
      <legend>Identificação do Usuário</legend>
	  <table>	  
	  <tr>
      <td> <img alt="Login na área restrita" border="0" src="images/login.png" title="Faça o login na área restrita" /></td>      
	  <td> <strong>Seja bem vindo à área restrita <br/> Para continuar, efetue o login: </strong></td>
	  </tr>
	  <tr>
      <td>  <label for="login">Login:</label> </td>
      <td>  <input id="login" name="login" size="40" type="text" /> </td>
     </tr>
      <tr>
        <td><label for="senha">Senha:</label></td>
        <td><input id="senha" name="senha" size="20" type="password" /></td>
     </tr>
	 <tr>
	 <td colspan="3"><input name="commit" type="submit" value="Login" /></td>
	 </tr>
	  </table>	
    </fieldset>
	
</form>
<a href="index.jsp"><img src="images/voltar.png" alt="Voltar ao Menu"></a>

</body>
</html>