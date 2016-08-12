package justnk.nk.ineocard.image;

import android.widget.ImageView;

/**
 * Created by Niraj on 8/12/2016.
 */
public class SetImage {
    public static void url(ImageView imageView,String u)
    {
        new DownLoadImageTask(imageView).execute(u);
    }
}
