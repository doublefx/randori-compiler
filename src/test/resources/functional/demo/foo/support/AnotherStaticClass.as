package demo.foo.support
{
public class AnotherStaticClass
{
    public function get stage():SupportClassA { return null; };
    
    public static function get current():AnotherStaticClass { return null; }
    
    public function AnotherStaticClass()
    {
    }
}
}