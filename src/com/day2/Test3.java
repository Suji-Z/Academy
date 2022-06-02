package com.day2;

public class Test3 {

	public static void main(String[] args) {
		int r = 10;
		float area, length;
		
		area = 10;
		System.out.println(area);

		//r = (int)20.0; //형변환
		//System.out.println(r);
		
		area = r*r*3.14f;
			//자바는 실수를 만나면 우선적 double(8byte)로 인식.
			//double 크기의 값이 4byte float에 들어갈 수 없기때문에 뒤에 f를 붙여 float으로 인식시켜야함
		
		length = r*2*3.14f;
		System.out.printf("반지름:%d, 넓이:%f\n", r,area);
		System.out.printf("반지름:%d, 넓이:%.2f\n", r,area);
		//printf의 %f에서만 사용 가능한 %.2f 소수점 아래 2자리까지만 표기하겠다는 의미
		System.out.println("반지름:" + r + ", 둘레:" + length);
		//println은 소수점 조정 불가능
	}

}
