insert IGNORE INTO department values(1, "Computer Science");
insert IGNORE INTO department values(2, "Mechanical");

insert IGNORE INTO semester values(1, "I");
insert IGNORE INTO semester values(2, "II");
insert IGNORE INTO semester values(3, "III");
insert IGNORE INTO semester values(4, "IV");
insert IGNORE INTO semester values(5, "V");
insert IGNORE INTO semester values(6, "VI");
insert IGNORE INTO semester values(7, "VII");
insert IGNORE INTO semester values(8, "VIII");

insert IGNORE INTO elective_course values(1, "ELECTIVE 1");
insert IGNORE INTO elective_course values(2, "ELECTIVE 2");
insert IGNORE INTO elective_course values(3, "ELECTIVE 3");

insert IGNORE INTO course values(1, "Calculus and Linear Algebra", 1, NULL, 1);
insert IGNORE INTO course values(2, "Engineering Physics", 1, NULL, 1);
insert IGNORE INTO course values(3, "Basic Electrical Engineering", 1, NULL, 1);
insert IGNORE INTO course values(4, "Elements of Civil Engineering and Mechanics", 1, NULL, 1);
insert IGNORE INTO course values(5, "Engineering Chemistry", 1, NULL, 1);

insert IGNORE INTO course values(6, "Data Mining and Data Warehousing", 1, 1, 1);
insert IGNORE INTO course values(7, "Object Oriented Modelling and Design", 1, 1, 1);
insert IGNORE INTO course values(8, "Cryptography, Network Security and Cyber Law", 1, 1, 1);



insert IGNORE INTO course values(9, "Mathematics", 1, NULL, 2);
insert IGNORE INTO course values(10, "Data Structures", 1, NULL, 2);
insert IGNORE INTO course values(11, "Computer Organization", 1, NULL, 2);
insert IGNORE INTO course values(12, "Software Engineering", 1, NULL, 2);
insert IGNORE INTO course values(13, "Discrete Mathematical Structures", 1, NULL, 2);

insert IGNORE INTO course values(14, "Introduction to Big Data Analytics", 1, 2, 2);
insert IGNORE INTO course values(15, "Programming in JAVA", 1, 2, 2);
insert IGNORE INTO course values(16, "Introduction to Operating System", 1, 2, 2);

insert IGNORE INTO student values(1, "Sumeet","Patil" ,1, 1);
insert IGNORE INTO student values(1, "Prashant","Gurav" ,1, 2);