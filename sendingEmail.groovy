
try{

	email = de.hybris.platform.util.mail.MailUtils.getPreConfiguredEmail();
	email.addTo("mailtoperson@mail.com");
	email.subject=" Hello I am the test email";
	email.msg = " Hello I am the email message who comes in the body of the email";
	email.from = "no-reply@mail.com";
	email.send();//Email will be sent to parties based on the email server configurations.

}catch(Exception ex){
println("Exception Occurred");
}
