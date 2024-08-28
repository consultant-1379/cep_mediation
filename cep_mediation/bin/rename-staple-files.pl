#!/usr/bin/perl
use strict;
use warnings;
use DateTime;

if ($#ARGV != 0) {
	print "usage: rename-staple-files staple_directory\n";
	exit;
}

my @files;

# Get and save the file names
opendir (DIR, $ARGV[0]) or die $!;
while (my $file_name = readdir(DIR)) {
	push(@files, $file_name);
}

closedir(DIR);

for (my $fileNo = 0; $fileNo <= $#files; $fileNo++) {
	# All files must end in ".log.gz"
	if ($files[$fileNo] !~ /\.log\.gz$/) {
		next;
	}
	
	# Get the epoch from the file name
	(my $epoch = $files[$fileNo]) =~ s/^.*_([0-9]*)\.log\.gz$/$1/;

	my $dt = DateTime->from_epoch( epoch => $epoch );

	my $year   = $dt->year;
	my $month  = $dt->month; # 1-12 - you can also use '$dt->mon'
	my $day    = $dt->day; # 1-31 - also 'day_of_month', 'mday'
	my $hour   = $dt->hour; # 0-23
	my $minute = $dt->minute; # 0-59 - also 'min'

	my $new_file_name = sprintf "A%04d%02d%02d.%02d%02d+0000-%04d%02d%02d.%02d%02d+0000_staple_%s", $year, $month, $day, $hour, $minute, $year, $month, $day, $hour, $minute, $files[$fileNo];
	
	print "renaming $files[$fileNo] to $new_file_name\n";
	rename ($ARGV[0] . "/" . $files[$fileNo], $ARGV[0] . "/" . $new_file_name) or die $!;
}

exit 0;
