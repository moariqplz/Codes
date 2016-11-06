#Created by Shelby King Completed 11/5/2016
use Spreadsheet::Read  qw(ReadData); #Used to read the data from the spread sheet
use Spreadsheet::ParseExcel;
use Data::Peek;
use strict;
use warnings;
use diagnostics;

use feature 'say';

use feature "switch";

use v5.24;
#creating the convert date function
sub convert_date
{
	#getting the value
	my ($temp_date) = @_;
	#initlizating temp string
	my $temp_string = 0;
	#setting string as date
	$temp_string = $temp_date;
	#initilizating array
	my @temp_array = "";
	#splitting array at all - to remove the - from taking from excel
	@temp_array = split('-', $temp_string);
	#recreating teh array but seeing date was backwards i joined to make it right again
	$temp_string = join("",$temp_array[1],$temp_array[2],$temp_array[0]);
	return $temp_string;
}
open(my $fh, '>>', 'report.txt');
my $book  = ReadData ("Book1.xlsx");
my $rowNumber = 1;
my $column_row_letter = "65";
my $temp_date = 0;
my $rowCounter = 1;
my $amount_Of_Rows = 21 #plus one for counter
my $amount_Of_columns = 76;#plus 66 for the askii letters
my @row = Spreadsheet::Read::row($book->[1], 1);

do{
#setting up a loop to run through the column 
#creating two loops to create a grid type of reader.
	do{
		#adding the letter and number into one value
		my $column_row_address = join "", chr($column_row_letter),$rowNumber;
		#finding that location in spreadsheet 1
		$temp_value = $book->[1]{$column_row_address};
		#printing the the TXT file
		#NOTE: using convert date to also write from converstion so I do not have to rewrite a whole another function and use more space
		print $fh convert_date($temp_value);
	    print $fh " ";
	    #going to the next column
		$column_row_letter++;
	}while $column_row_letter != $amount_Of_columns;
		#resetting the column
		$column_row_letter = 65;
		$rowNumber++;
		#creating a  new line for the next row
		print $fh "\n";
}while $rowNumber != $amount_Of_Rows;
close $fh;


