package SELENIUMTESTS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFEvaluationWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class excelreadDemo {
	public static int xlrows,xlcols;
	public static String Title;
	public static WebDriver driver1;
	public static String xdata[][];
	public static String myURL;
public static void main (String [] args) throws Exception
{
	xlRead("C:\\oneness\\datalist_to_read");
	//myURL="https://www.amazon.in/";
	for (int i=1;i<xlrows;i++)
	{
	if (xdata[i][1].contains("Y"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver1=new ChromeDriver();
		driver1.get("https://www.google.com");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver1.findElement(By.className(""));
		driver1.findElement(By.className("gLFyf")).sendKeys(xdata[i][2]);
		driver1.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		Title=driver1.getTitle();
		xdata[i][4]=Title;
		
		if(xdata[i][4].contains(xdata[i][3]))
		{
			xdata[i][5]="PASS";
		}
		else
		{
			xdata[i][5]="FAIL";
		}
		
		driver1.close();
		}
		}
		

	}
	

	

	

		// TODO Auto-generated method stub
public static void xlRead (String spath) throws Exception
{
		File myfile=new File(spath);
		FileInputStream mystream = new FileInputStream(myfile);
		HSSFWorkbook mybook=new HSSFWorkbook (mystream);
		HSSFSheet mysheet = mybook.getSheetAt(0);
		xlrows = mysheet.getLastRowNum()+1;
		xlcols=mysheet.getRow(0).getLastCellNum();
		System.out.println("Total rows in a sheet are: " +xlrows);
		System.out.println("Total coloumss in a sheet are: " +xlcols);
		
		xdata=new String[xlrows][xlcols];
		for(int i=0;i<xlrows;i++)
		{
			HSSFRow myrow=mysheet.getRow(i);
			for(short j=0;j<=xlcols;j++)
			{
				HSSFCell cell= new myrow.getCell(j);
				String cellvalue= cellToString(cell);
				xdata[i][j]=cellvalue;
				System.out.println("Data array" +xdata[i][j]);
			}
			System.out.println();
		}	
								
			}

public static String cellToString(HSSFCell cell)
{
	int celltype=cell.getCellType();
	Object Result;
	switch(celltype)
	{
	case HSSFCell.CELL_TYPE_NUMERIC:
	Result=cell.getNumericCellValue();
	break;
	case HSSFCell.CELL_TYPE_STRING:
	
		Result=cell.getStringCellValue();
		break;
	case HSSFCell.CELL_TYPE_FORMULA:
		throw new RunTimeException("We can not evaluate formula");
	case HSSFCell.CELL_TYPE_BLANK:
		Result="-";
		
		
	case HSSFCell.CELL_TYPE_BOOLEAN:
		
		Result=cell.getBooleanCellValue();
		
	case HSSFCell.CELL_TYPE_ERROR:
		Result="Cell is having some problem";
	default:
		throw new RuntimeException("We do not evaluate this data");
		}
		return Result.toString();
		}
		

}


	}

}
