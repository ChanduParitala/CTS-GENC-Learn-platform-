package com.mobile.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;

import com.mobile.model.Mobile;
import com.mobile.util.MobileStore;
import com.mobile.exception.InvalidMobileException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MobileStoreTest {

	private static List<Mobile> mobileList = new ArrayList<Mobile>();
	private static MobileStore mobileStoreObj = null;

	@BeforeClass
	public static void setUp() throws Exception {

		mobileStoreObj = new MobileStore();

		// Create few objects for Mobile class and add to mobileList.
		// Use that list to test all the methods in MobileTest class that requires a
		// list of Mobile
		// (String IMEINumber, String mobileType, String brand, String model, double
		// mobilePrice)
		Mobile m1 = new Mobile("123456", "smartphone", "Nokia", "Experia3", 5000);
		Mobile m2 = new Mobile("789123", "SamartPhone", "Samsung", "NoteS21", 15000);
		Mobile m3 = new Mobile("053456", "Smartphone", "Apple", "XS", 55000);
		Mobile m4 = new Mobile("987456", "Basic", "Jio", "3X", 500);
		Mobile m5 = new Mobile("555262", "basic", "Motorola", "C21", 1000);
		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);
		mobileList.add(m5);

	}

	// Test the validateMobileType method when the value is SmartPhone
	public void test11ValidateMobileTypeWhenSmartPhone() throws InvalidMobileException {

		// fill code
		assertTrue(mobileStoreObj.validateMobileType("Smartphone"));
	}

	// Test the validateMobileType method when the value is Basic
	public void test12ValidateMobileTypeWhenBasic() throws InvalidMobileException {

		// fill code
		assertTrue(mobileStoreObj.validateMobileType("Basic"));
	}

	// Test the validateMobileType method when the value is Invalid
	public void test13ValidateMobileTypeWhenInvalid() throws InvalidMobileException {

		// fill code
		mobileStoreObj.validateMobileType("UltraNew");
	}

	// Test the viewMobile method for a valid IMEINumber
	public void test14ViewMobileForValidIMEINumber() throws InvalidMobileException {

		// fill code
		// Mobile viewMobile(List<Mobile> mobileList,String IMEINumber)
		assertTrue(mobileStoreObj.viewMobile(mobileList, "123456").getIMEINumber() == "123456");
	}

	// Test the viewMobile method for invalid IMEINumber
	public void test15ViewMobileForInvalidIMEINumber() throws InvalidMobileException {
		
		//fill code	
		//Mobile viewMobile(List<Mobile> mobileList,String IMEINumber)
		mobileStoreObj.viewMobile(mobileList,"Samsung1234");
	}
	
	//Test the viewMobilesByBrand method 	
	public void test16ViewMobilesByBrand() throws InvalidMobileException {

		// fill code
		List<Mobile> m1 = mobileStoreObj.viewMobilesByBrand(mobileList, "Nokia");
		assertTrue(m1.get(0).getBrand() == "Nokia");

	}

	// Test the viewMobilesByBrand method for empty list
	public void test17ViewMobilesByBrandForEmptyList() throws InvalidMobileException {

		// fill code
		ArrayList<Mobile> m = new ArrayList<>();
		mobileStoreObj.viewMobilesByBrand(m, "nnn");

	}

	// Test the viewMobilesBrandWise method
	public void test18ViewMobilesBrandWise() throws InvalidMobileException {

		// fill code
		assertFalse(mobileStoreObj.viewMobilesBrandWise(mobileList).isEmpty());
	}

	private void assertFalse(boolean empty) {
		// TODO Auto-generating mathod stub
	}

	// Test the viewMobilesBrandWise method for empty list
	public void test19ViewMobilesBrandWiseForEmptyList() throws InvalidMobileException {

		// fill code
		ArrayList<Mobile> m = new ArrayList<>();
		mobileStoreObj.viewMobilesBrandWise(m);

	}

	// Test the countTotalModelsForEachBrand method
	public void test20CountTotalModelsForEachBrand() throws InvalidMobileException {

		// fill code
		Map<String, Integer> m3 = mobileStoreObj.countTotalModelsForEachBrand(mobileList, 5000.0);
		// Set<String>key=m3.keySet();
		assertFalse(mobileStoreObj.countTotalModelsForEachBrand(mobileList, 100000.0).isEmpty());

	}

	// Test the countTotalModelsForEachBrand method for empty list
	public void test21CountTotalModelsForEachBrandForEmptyList() throws InvalidMobileException {

		// fill code
		ArrayList<Mobile> m = new ArrayList();
		mobileStoreObj.countTotalModelsForEachBrand(m, 50.0);

	}
}
