package com.example.admin.alertdialog;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Offerta
{
  private String File;
  private String Text;
  private String objectId;
  private String ownerId;
  private java.util.Date created;
  private java.util.Date updated;
  private String Name;
  public String getFile()
  {
    return File;
  }

  public void setFile( String File )
  {
    this.File = File;
  }

  public String getText()
  {
    return Text;
  }

  public void setText( String Text )
  {
    this.Text = Text;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getName()
  {
    return Name;
  }

  public void setName( String Name )
  {
    this.Name = Name;
  }

                                                    
  public Offerta save()
  {
    return Backendless.Data.of( Offerta.class ).save( this );
  }

  public Future<Offerta> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Offerta> future = new Future<Offerta>();
      Backendless.Data.of( Offerta.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Offerta> callback )
  {
    Backendless.Data.of( Offerta.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Offerta.class ).remove( this );
  }

  public Future<Long> removeAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Long> future = new Future<Long>();
      Backendless.Data.of( Offerta.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Offerta.class ).remove( this, callback );
  }

  public static Offerta findById( String id )
  {
    return Backendless.Data.of( Offerta.class ).findById( id );
  }

  public static Future<Offerta> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Offerta> future = new Future<Offerta>();
      Backendless.Data.of( Offerta.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Offerta> callback )
  {
    Backendless.Data.of( Offerta.class ).findById( id, callback );
  }

  public static Offerta findFirst()
  {
    return Backendless.Data.of( Offerta.class ).findFirst();
  }

  public static Future<Offerta> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Offerta> future = new Future<Offerta>();
      Backendless.Data.of( Offerta.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Offerta> callback )
  {
    Backendless.Data.of( Offerta.class ).findFirst( callback );
  }

  public static Offerta findLast()
  {
    return Backendless.Data.of( Offerta.class ).findLast();
  }

  public static Future<Offerta> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Offerta> future = new Future<Offerta>();
      Backendless.Data.of( Offerta.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Offerta> callback )
  {
    Backendless.Data.of( Offerta.class ).findLast( callback );
  }

  public static BackendlessCollection<Offerta> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Offerta.class ).find( query );
  }

  public static Future<BackendlessCollection<Offerta>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Offerta>> future = new Future<BackendlessCollection<Offerta>>();
      Backendless.Data.of( Offerta.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Offerta>> callback )
  {
    Backendless.Data.of( Offerta.class ).find( query, callback );
  }
}