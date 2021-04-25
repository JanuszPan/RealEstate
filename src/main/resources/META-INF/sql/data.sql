insert into real_estate.voivodeship(name) value ('małopolskie');
insert into real_estate.city(name) value ('Kraków');
insert into real_estate.district(name) value ('Dąbie');
insert into real_estate.apartments(area, bathrooms, description, image, lift, parking, rooms, storey, district_id) values (50,1,'Mieszkanie położone na Dąbiu, przy ul. Bajecznej',LOAD_FILE('baj1.jpg'),false,'brak',1,1,1);
select *from real_estate.voivodeship;
select *from real_estate.city;
select *from real_estate.district;
select *from real_estate.apartments;
