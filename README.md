# repository

Instruções para testes da aplicação no Eclipse.

Download necessário: TomCat 7.0 (zip):
https://tomcat.apache.org/download-70.cgi
Extraí-lo em um diretório.

Para abrir no eclipse: clonar o repositório do git, em um diretório. 
No eclipse, ir em File > General > Existing Projects into Workspace.
Na opção "Select root directory" > Browse, selecionar o diretório do projeto (o mesmo será exibido na janela "Projects") > Finish.
Adicione um servidor, File > New > Other. Buscar por server no campo "Wizard" > Next.
No campo "Select the server type", Tomcat > Tomcat v7.0 Server > Next.
Selecione o diretório no qual foi extraído o Tomcat > Finish. O servidor deverá ser exibido no "Project Explorer".
Clique com o botão direito no projeto, Propriedades > Targeted Runtime. Seleciona somente o servidor Tomcat 7.0, aplicar.
Na barra inferior em Servers, clique com o botão direito "Add and Remove", adicione o projeto, Finish.
Reinicie o servidor.
Página inicial : http://localhost:8080/youfood/pedido.

Aplicação back-end desenvolvida em JAVA, front-end em HTML, com servlets e servidor Tomcat. Utilizado conceitos de orientação a objetos, 
porém sem acesso a banco de dados. Esquema de camadas para endpoint, data access object, service, resource (servlets).



