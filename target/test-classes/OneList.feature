#Author: wiwingulo@gmail.com
Feature: Add New List
	
Scenario Outline: Add activity based on title list
	Given User berada di halaman MainActivity
	When User menekan tombol add user
	And User input list name "Makanan"
	And User menekan tombol centang untuk menyimpan list name
	And User input isi list 1 "Jerman"
	And User input isi list 2 "Balige"
	Then User input isi list 3 "Medan"
	And User kembali ke halaman MainActivity
	
Scenario Outline: Add activity with number
	Given User berada di halaman MainActivity
	When User menekan tombol add user
	And User input list name 2 "212313"
	And User menekan tombol centang untuk menyimpan list name
	And User input isi list 1 "Jerman"
	And User input isi list 2 "Balige"
	Then User input isi list 3 "Medan"
	And User kembali ke halaman MainActivity
	