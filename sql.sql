--	!!!! SQLs do programa !!!!
--findById
SELECT  seller.*, department.Name as DepName
FROM seller INNER JOIN department
ON seller.DepartmentId = department.Id
WHERE seller.Id = ?

--findAll order by Name
SELECT  seller.*, department.Name as DepName
FROM seller INNER JOIN department
ON seller.DepartmentId = department.Id
ORDER BY Name

--findByDepartment order by Name
SELECT  seller.*, department.Name as DepName
FROM seller INNER JOIN department
ON seller.DepartmentId = department.Id
WHERE DepartmentId = ?
ORDER BY Name

--insert
INSERT INTO seller
(Name, Email, BirthDate, BaseSalary, DepartmentId)
VALUES (?, ?, ?, ?, ?)

--update
UPDATE seller
SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ?
WHERE Id = ?

--delete
DELETE FROM seller
WHERE Id = ?