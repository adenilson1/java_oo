package Model.Entities;

import Model.Exceptions.BusinessException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withdraw(Double amount) {

		if (balance.compareTo(withdrawLimit) < 0 && balance.compareTo(amount) < 0) {
			throw new BusinessException("Not enough balance");
		}

		if (amount.compareTo(withdrawLimit) <= 0 && amount.compareTo(balance) <= 0) {
			balance -= amount;
		} else {
			throw new BusinessException("The amount exceeds withdraw limit");
		}
	}

	@Override
	public String toString() {
		return "New balance: " + String.format("%.2f", balance);
	}

}
