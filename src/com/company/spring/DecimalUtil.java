package com.company.spring;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class DecimalUtil {
	public static BigDecimal add(double x, double y) {
		BigDecimal bx = new BigDecimal(Double.valueOf(x));
		BigDecimal by = new BigDecimal(Double.valueOf(y));
		return bx.add(by);
	}

	public static BigDecimal add(String x, String y) {
		BigDecimal bx = new BigDecimal(x);
		BigDecimal by = new BigDecimal(y);
		return bx.add(by);
	}

	public static BigDecimal sub(double x, double y) {
		BigDecimal bx = new BigDecimal(Double.valueOf(x));
		BigDecimal by = new BigDecimal(Double.valueOf(y));
		return bx.subtract(by);
	}

	public static BigDecimal sub(String x, String y) {
		BigDecimal bx = new BigDecimal(x);
		BigDecimal by = new BigDecimal(y);
		return bx.subtract(by);
	}

	public static BigDecimal mul(double x, double y) {
		BigDecimal bx = new BigDecimal(Double.valueOf(x));
		BigDecimal by = new BigDecimal(Double.valueOf(y));
		return bx.multiply(by);
	}

	public static BigDecimal mul(String x, String y) {
		BigDecimal bx = new BigDecimal(x);
		BigDecimal by = new BigDecimal(y);
		return bx.multiply(by);
	}

	public static BigDecimal div(double x, double y) {
		BigDecimal bx = new BigDecimal(Double.valueOf(x));
		BigDecimal by = new BigDecimal(Double.valueOf(y));
		return bx.divide(by, 2, BigDecimal.ROUND_HALF_UP);
	}

	public static BigDecimal div(String x, String y) {
		BigDecimal bx = new BigDecimal(x);
		BigDecimal by = new BigDecimal(y);
		return bx.divide(by, 2, BigDecimal.ROUND_HALF_UP);
	}
}
