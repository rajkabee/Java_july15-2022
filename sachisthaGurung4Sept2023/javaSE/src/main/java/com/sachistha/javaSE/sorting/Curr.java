package com.sachistha.javaSE.sorting;

public class Curr {
	static class Currency{
		int rs;
		int paisa;
		public Currency(int rs, int paisa) {
			this.rs=rs;
			this.paisa = paisa;
			
		}
		@Override
		public String toString() {
			return "Currency [rs=" + rs + ", paisa=" + paisa + "]";
		}
		
	}
	public static void main(String[] args) {
		Currency cur[] = {
				new Currency(123, 455),
				new Currency(124, 42),
				new Currency(543, 99),
				new Currency(543, 44),
				new Currency(4, 32)
		};
		int max=0;
		for(int i=1; i<5; i++) {
			if(cur[max].rs<=cur[i].rs) {
				if(cur[max].rs<cur[i].rs) {
					max=i;
				}
				else if(cur[max].rs<cur[i].rs) {
					if(cur[max].paisa<cur[i].paisa) {
						max=i;
					}
				}
			}
		}
		System.out.println(cur[max]);
	}
}
