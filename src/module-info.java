module WhiskyFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires vertx.web.client;
	requires vertx.core;
	
	opens utn.frp.p3.application.view to javafx.graphics, javafx.fxml;
}
