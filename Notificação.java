package com.example.appos;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class Notificação {
    public void notfc(Context context){
    /*NOTIFICAÇÃO SIMPLES
     * ESSA NOTIFICAÇÃO FOI TIRADA DA DOCUMENTAÇÃO DA GOOGLE
     * */
        //channel
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel
                    ("Funciono", "Notificação", NotificationManager.IMPORTANCE_DEFAULT);

            //gerenciador de notificação
            NotificationManager ntfManager = (NotificationManager) context.getSystemService
                    (Context.NOTIFICATION_SERVICE);

            ntfManager.createNotificationChannel(channel);
        }
        //notificação
        NotificationCompat.Builder builder = new NotificationCompat.Builder
            (context, "Funciono")
            .setSmallIcon(android.R.drawable.ic_dialog_alert)
            .setContentTitle("Notificação")
            .setContentText("Eu faço alguma coisa")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT);
             NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
                notificationManager.notify(0, builder.build());
}}
