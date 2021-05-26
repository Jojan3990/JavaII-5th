<?php
// <applet code="CheckLessThan.class" width="300" height="100">
// <param name="var" value="Jojannn">
// </applet>

    if(isset($_POST['varshow']) && !empty($_POST['varshow'])){
        $store=$_POST['var'];
    ?>
        <applet code="CheckLessThan.class" width="300" height="100">
            <param name="var" value="<?php echo $store ; ?>">
        </applet> 
    <?php
    }
?>
<html>
    <body>
        <form action="<?php echo $_SERVER['PHP_SELF'] ?>" method="POST">
            Enter String : <input type="text" name="varshow">
            <input type="submit" value="SUBMIT">
        </form>
        
    </body>
</html>