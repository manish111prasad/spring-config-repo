<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>

<div class="container mt-4">
    <form>
        <div class="row mb-3">
            <div class="col-md-3">
                <label for="planName" class="form-label">Plan Name:</label>
                <select id="planName" name="planName" class="form-select">
                    <option>-Select-</option>
                    <!-- Add more options here -->
                </select>
            </div>
            <div class="col-md-3">
                <label for="planStatus" class="form-label">Plan Status:</label>
                <select id="planStatus" name="planStatus" class="form-select">
                    <option>-Select-</option>
                    <!-- Add more options here -->
                </select>
            </div>
            <div class="col-md-3">
                <label for="gender" class="form-label">Gender:</label>
                <select id="gender" name="gender" class="form-select">
                    <option>-Select-</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <!-- Add more options here -->
                </select>
            </div>
        </div>
        <div class="row mb-3">
            <div class="col-md-3">
                <label for="startDate" class="form-label">Start Date:</label>
                <input type="date" id="startDate" name="startDate" class="form-control"/>
            </div>
            <div class="col-md-3">
                <label for="endDate" class="form-label">End Date:</label>
                <input type="date" id="endDate" name="endDate" class="form-control"/>
            </div>
            <div class="col-md-3 align-self-end">
                <button type="submit" class="btn btn-primary">Search</button>
            </div>
        </div>
    </form>
    <hr/>
    <hr/>
    <div>
        Export : 
        <a href="exportExcel" target="_blank">Excel</a>
        <a href="exportPdf" target="_blank" class="ms-2">Pdf</a>
    </div>
</div>
	
	 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
	
</body>
</html>
