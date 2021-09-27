package com.utest.qvision.utilities;

import java.util.Random;

public class Utility {

	public String generarNumeroRandom(int cantidadDitito){
		return (new Long (String.valueOf (new Random().nextLong()).replace("-","").substring(0,cantidadDitito)).toString());
	}
}
