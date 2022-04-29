package ExtentReportPackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentreportGeneration {
	static ExtentReports er;
public static  ExtentReports reportGen()
{
	ExtentHtmlReporter hr=new ExtentHtmlReporter("C:\\Users\\manis\\eclipse-workspace0\\ZerodhaAutomationtest\\Report\\Zerodha.html");
	hr.config().setReportName("ZerodhaReports");
	hr.config().setTheme(Theme.DARK);
	hr.config().getTimeStampFormat();
	 er=new ExtentReports();
	er.attachReporter(hr);
	er.setSystemInfo("Project Name", "Zerodha");
	er.setSystemInfo("Environment Name", "SIT");
	er.setSystemInfo("Excuted By", "MR.RAJ PATIL");
	
	return er;
}
}