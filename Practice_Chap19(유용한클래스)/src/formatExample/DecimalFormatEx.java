package formatExample;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		
		double number = 5577669.78;
		
		//0은 자릿수를 다 차지하고 표식을하는 반면에, #은 표현은 다 하되, 숫자에 자리가없다면 표시를 하지않는다.
		DecimalFormat dFormat = new DecimalFormat("0");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("0.0");       //한자리만 반올림해줌
		System.out.println(dFormat.format(number));     
		
		dFormat = new DecimalFormat("000000000.00000");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("#");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("#.#");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("#########.#####");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("#,###.00");
		System.out.println(dFormat.format(number));
	}

}
