package tut3p1;

public class VendingMachineApp {
	public static void main(String[] args) {
		double drinkCost, balance;
		VendingMachine vm = new VendingMachine();
		drinkCost = vm.selectDrink();
		balance = vm.insertCoins(drinkCost);
		vm.checkChange(balance, drinkCost);
		vm.printReceipt();
	}
}
