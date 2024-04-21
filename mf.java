document.getElementById('toggleImage').addEventListener('click', function() {
      if (document.getElementById('myImage').style.display === 'none') {
        document.getElementById('myImage').style.display = 'block';
      } else {
        document.getElementById('myImage').style.display = 'none';
      }
    });