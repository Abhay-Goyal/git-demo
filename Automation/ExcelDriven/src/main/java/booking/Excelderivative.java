package booking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelderivative {

	public static void main(String[] args) throws IOException {

		Excelderivative ed = new Excelderivative();
		ArrayList<String> a = ed.getData("OPUS", "Fname", "Rajat");

		System.out.println(a);
	}

	public ArrayList<String> getData(String Sheetname, String TestCase, String TestCaseName) throws IOException {

		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("E://Test.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int x = workbook.getNumberOfSheets();
		for (int i = 0; i < x; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(Sheetname)) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> it = sheet.iterator();
				Row firstrow = it.next();
				Iterator<Cell> cell = firstrow.cellIterator();
				int k = 0;
				int column = 0;
				Cell value = null;
				while (cell.hasNext()) {
					value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase(TestCase)) {
						column = k;
						break;
					}
					k++;
				}
				while (it.hasNext()) {
					Row r = it.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(TestCaseName)) {

						Iterator<Cell> newcell = r.cellIterator();

						while (newcell.hasNext()) {
							a.add(newcell.next().getStringCellValue());
						}
					}
				}

			}

		}
		return a;
	}
}