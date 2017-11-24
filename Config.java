/**
 * Created by lucas on 23.11.17.
 */
public class Config {

    public static RGB ambient_color = new RGB(0.01f,0.01f,0.01f);
    public static RGB background_color = new RGB(0.05f,0.05f,0.05f);
    public static RGB black = new RGB(0.0f,0.0f,0.0f);
    public static int y_angle_factor = 4;
    public static int x_angle_factor = -4;
    public static float fovx=(float) 0.628;
    public static float fovy=(float) 0.628;
    public static Vec3D mainLight  = new Vec3D(0,100,0, new RGB(0.1f,0.1f,0.1f));
    public static Vec3D lights[]= new Vec3D[]{ mainLight
                ,new Vec3D(100,200,300, new RGB(0.5f,0,0.0f))
                ,new Vec3D(-100,200,300, new RGB(0.0f,0,0.5f))
                //,new Vec3D(-100,0,0, new RGB(0.0f,0.8f,0.0f))
    };
}
