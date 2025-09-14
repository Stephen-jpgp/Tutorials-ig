python manage.py runserver - to run a django project
A virtual environment should be created to create a django project in it - source myworld/Scripts/activate is the command to create as well as open the virtual environment.
views.py are actually python functions

Adding data:
  To access shell
    python manage.py shell 
  To start accessing the database=>
    from genshin_tracker.models import Character
  To look at the empty table
    Character.objects.all() -> to look at the empty table()
  Adding a value
    character = Character(name='Lauma',level=90,element='Dendro') -> adding a value
    character.save()
    Character.objects.all().values() -> to see all values
  Adding multiple values
    character2 = Character(name='Nahida',level=90,element='Dendro')
    character3=Character(name='Zhongli',level=90,element='Geo')
    charList=[character2,character3]
    for x in charList:
      x.save()
    Character.objects.all().values()
  To access a particular character
    x = Character.objects.all()[3]
  After accessing, you can update a value:
    x.name='Ningguang'
    x.save()
  To delete a value
    x.delete()

To create/update tables and details > creates new migration files
  python manage.py makemigrations genshin_tracker
To apply said migrations -> applies generated migration files to the db
  python manage.py migrate
    
    
